package cn.nowdo.cloud.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;

public class WpURIFactory {
	public static URI getURI(String scheme, String baseURI, String path, Map<String, String> paramMap) throws URISyntaxException {
		URIBuilder uriBuilder = new URIBuilder().setScheme(scheme)
				.setHost(baseURI).setPath(path);
		if(paramMap != null) {
			for(String key : paramMap.keySet()) {
				uriBuilder.setParameter(key, paramMap.get(key));
			}
		}
		return uriBuilder.build();
	}
}