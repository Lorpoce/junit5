package fr.xebia.xke.junit5.extension.impl;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.TestExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

  private static final Logger LOG = LoggerFactory.getLogger(TimingExtension.class);

  @Override
  public void beforeTestExecution(TestExtensionContext context) throws Exception {
    getStore(context).put(context.getTestMethod().get(), System.currentTimeMillis());
  }

  @Override
  public void afterTestExecution(TestExtensionContext context) throws Exception {
    Method testMethod = context.getTestMethod().get();
    long start = getStore(context).remove(testMethod, long.class);
    long duration = System.currentTimeMillis() - start;

    LOG.info("Method [{}] took {} ms.", testMethod.getName(), duration);
  }

  private Store getStore(TestExtensionContext context) {
    return context.getStore(Namespace.create(getClass(), context));
  }

}
