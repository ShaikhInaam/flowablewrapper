package com.InteractionLogging.InteractionLogging.controller;


import com.InteractionLogging.InteractionLogging.request.InteractionLoggingRequest;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargeNavigateProcessRequest;
import com.InteractionLogging.InteractionLogging.request.PaymentAndChargesStartProcessRequest;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargeNavigateProcessResponse;
import com.InteractionLogging.InteractionLogging.response.PaymentAndChargesStartProcessResponse;
import com.InteractionLogging.InteractionLogging.service.base.PaymentAndChargesService;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.Charset;

@RestController
@RequestMapping("help-and-support/payment-and-charges")
public class PaymentAndChargesController {


    @Autowired
    PaymentAndChargesService service;

    @PostMapping("/process/start")
    public ResponseEntity startProcess(@RequestBody PaymentAndChargesStartProcessRequest request) {

        PaymentAndChargesStartProcessResponse response;

        try{

            response = service.startProcess(request);


        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<String>("Something went wrong!", HttpStatus.OK);
        }


        return new ResponseEntity<PaymentAndChargesStartProcessResponse>(response, HttpStatus.OK);

    }



    @PostMapping("/process/navigate")
    public ResponseEntity navigateProcess(@RequestBody PaymentAndChargeNavigateProcessRequest request) {

        PaymentAndChargeNavigateProcessResponse response;

        try{

            response = service.navigateProcess(request);


        }catch (Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<String>("Something went wrong!", HttpStatus.OK);
        }


        return new ResponseEntity<PaymentAndChargeNavigateProcessResponse>(response, HttpStatus.OK);

    }



    @GetMapping("/process/upload")
    public ResponseEntity uploadTable() throws Exception{

        InputStream in = new FileInputStream(new File("D:\\FAIL_OVER_SUB_CATEGORIES_DECISION_SCENARIO.dmn"));
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strCurrentLine;
        StringBuffer sbb = new StringBuffer();
        while ((strCurrentLine = br.readLine()) != null) {

            sbb.append(strCurrentLine);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);

        String auth = "admin" + ":" + "test";
        byte[] encodedAuth = Base64.encodeBase64(
                auth.getBytes(Charset.forName("US-ASCII")) );
        String authHeader = "Basic " + new String( encodedAuth );
        headers.set( "Authorization", authHeader );

        MultiValueMap<String, Object> body
                = new LinkedMultiValueMap<>();
        body.add("file", sbb);

        HttpEntity<MultiValueMap<String, Object>> requestEntity
                = new HttpEntity<>(body, headers);

        String serverUrl = "http://localhost:8080/flowable-rest/dmn-api/dmn-repository/deployments";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate
                .postForEntity(serverUrl, requestEntity, String.class);

        System.out.println(response);
        return new ResponseEntity<String>("Done", HttpStatus.OK);

    }



    @RequestMapping(method = { RequestMethod.POST},
            consumes = { "multipart/form-data" }, path = "/process/upload")
    public ResponseEntity uploadTable1(@RequestParam("file") MultipartFile file) throws Exception{






        return new ResponseEntity<String>("Name : "+file.getName()+" Size : "+file.getSize(), HttpStatus.OK);

    }




}
