package uk.gov.api.springboot.config;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Component
public class MdcFacade {
  public void put(String key, String value) {
    MDC.put(key, value);
  }

  public void clear() {
    MDC.clear();
  }
}
