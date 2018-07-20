package com.mapbox.mapboxsdk.http;

public interface HttpRequestResponder {
  void onResponse(int responseCode, String eTag, String lastModified, String cacheControl, String expires,
                  String retryAfter, String xRateLimitReset, byte[] body);
  void handleFailure(int type, String errorMessage);
}
