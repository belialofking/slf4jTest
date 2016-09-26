/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.slf4jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author guitar
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Logger log = LoggerFactory.getLogger(Main.class);
    log.info("hello");
    Logs.get().info("hello world!");
  }
  
}
