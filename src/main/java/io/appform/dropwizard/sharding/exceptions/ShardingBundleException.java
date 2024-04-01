package io.appform.dropwizard.sharding.exceptions;

public class ShardingBundleException extends RuntimeException{

    public ShardingBundleException(String message, Throwable cause){
        super(message, cause);
    }
}
