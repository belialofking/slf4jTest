package com.mycompany.slf4jtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author guitar
 */
public class Logs {
  public static Logger get() {
    StackTraceElement[] sts = Thread.currentThread().getStackTrace();
    return LoggerFactory.getLogger(sts[2].getClassName());
  }
}
