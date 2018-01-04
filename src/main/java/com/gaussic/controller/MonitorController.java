package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xingxing on 2018/1/4.
 */
@Controller
public class MonitorController {

    public static final String RSA_PRIVATE_KEY = "MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBANkL8jVtsk+IwBP/5fTd2mrgA5VXMqUIotq67KCUdTqqf9A6z79poWWMmIuR/S5671/cMS2Q1GEZ3gUTGv91+xKREl4Ab6WaSU1EhEs+apOv4zhYyMGV3srlknwagdtcwXWfYDzMxNCiqtJoYuICXlAVH20hyLCPAasHPs7hR371AgMBAAECgYEApyCrwLhXNSb3wG6rg4HRTbpxB+288ZdUz1hgHMYz/piLEqw2jA2qWaeJTu97JO9Eo2vJ8mwzHRHuA7pSb6NJT/egm1mHU1cx8mqMU6pzjBYA2GwUMzZh5n6+FpC1+9NVp96vt1TSe4AX12iZ7IByYr3r6O8pxuC/hJSE7ZKAUAECQQDr/WQPfRk9stl5lZqGVcYRpmnyyv5R/T0+3i1V4ycfvQ1sQqUnWvE2U2PaiBHlVU6rKtf/5qNLCfCZWizA+L1VAkEA63NbshxddGyFgT1E0GULQaRNRxV3kGU4v1sUFy8eCFUccvSSlz2incFRAdXV/GlqXGhKpXDLJHFJ/ijNg0K7IQJBAJgtFRobzGwJ6c1KmJOpugjlrAqBtg/+4kCpGsj4quD/kylNrJw9O7CRg6GG/ytIoGsmPJVrD7+y0DDDgnqJq+UCQQCHRgbXxQ44dqUZhK8FoBgghZpUjdPc5Rr+bgCT9WEm3mdy8GtMc3/7bPbyu/2ugI44Oz8v4CcGcARX/u9cS7mhAkEAxvKj0Rj3MMBhpEotY9GQ9t8bBeF4d4EB9tpTioWziiHUi1X+sKdqUm4wumJArTrySTAECWVUkEDiL14XsEiNqA==";

    @RequestMapping(value = "/status/check", method = RequestMethod.GET)
    @ResponseBody
    public String checkStatus() {
        return "{\"code\":200, \"data\": \"ok\"}";
    }
}
