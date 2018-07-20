package com.mapbox.mapboxsdk.http;

public abstract class HttpRequest {

  static final int CONNECTION_ERROR = 0;
  static final int TEMPORARY_ERROR = 1;
  static final int PERMANENT_ERROR = 2;

  public abstract void executeRequest(HttpRequestResponder httpRequest, long nativePtr, String resourceUrl,
                                      String etag, String modified);

  public abstract void cancelRequest();
}
