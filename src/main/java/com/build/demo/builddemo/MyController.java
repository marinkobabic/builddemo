/*
 * © 2019 CREALOGIX. All rights reserved.
 */
package com.build.demo.builddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @GetMapping(path = "/")
  public String sayHi() {
    return "This is my controller";
  }
}
