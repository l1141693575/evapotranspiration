package com.zb.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfig {
    @Value("${es.hostlist}")
    private String hostlist;

    @Bean
    public RestHighLevelClient createRestHighLevelClient() {
        //192.168.1.110:9200,192.168.1.110:9201
        String[] split = hostlist.split(",");
        HttpHost[] httpHosts = new HttpHost[split.length];
        for (int i = 0; i < split.length; i++) {
            String item = split[i];
            HttpHost httpHost = new HttpHost(item.split(":")[0], Integer.parseInt(item.split(":")[1]), "http");
            httpHosts[i] = httpHost;
        }
        return new RestHighLevelClient(RestClient.builder(httpHosts));
    }
}
