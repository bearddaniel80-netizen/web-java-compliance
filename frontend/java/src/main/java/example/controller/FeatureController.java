package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/feature") // Base URL path for all endpoints in this c
public class FeatureController {

  private final String FOLDER = "feature";

  @GetMapping("/cache")
  public String cache() {
      return "forward:/" + FOLDER + "/cache.html";
  }
  
  @GetMapping("/failfast")
  public String failFast() {
      return "forward:/" + FOLDER + "/failfast.html";
  }
  
  @GetMapping("/failfast-query")
  public String failFastQuery() {
      return "forward:/" + FOLDER + "/failfast-query.html";
  }
  
  @GetMapping("/profile")
  public String profile() {
      return "forward:/" + FOLDER + "/profile.html";
  }

  @GetMapping("/retry")
  public String retry() {
      return "forward:/" + FOLDER + "/retry.html";
  }
}