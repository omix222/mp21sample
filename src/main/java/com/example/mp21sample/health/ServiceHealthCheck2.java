package com.example.mp21sample.health;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

/**
 * 複数ヘルスチェックするロジックを持つサンプル.
 * 一つでもdownと判断されたら、"outcome": "DOWN"となり、全体としてサービスNGを示すこととなる
 */
@Health
@ApplicationScoped
public class ServiceHealthCheck2 implements HealthCheck {

    @Override
    public HealthCheckResponse call() {

        return HealthCheckResponse.named(ServiceHealthCheck2.class
                .getSimpleName())
                .withData("custom key2","custom value2")
                .up()
                .build();

    }
}


