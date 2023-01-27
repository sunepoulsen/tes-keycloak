package dk.sunepoulsen.tes.keycloak.client;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;

/**
 * Integrator class to integrate with Keycloak.
 * <p>
 *     The purpose of this class is to send requests for supported operations by this client library to a Keycloak
 *     instance.
 * </p>
 */
@Slf4j
@Data
public class KeycloakIntegrator {
    /**
     * Base URL to the Keycloak instance.
     */
    private URI baseUrl;

    /**
     * Constructs a new instance that can be used to integrate with Keycloak.
     *
     * @param baseUrl The complete base URL to Keycloak.
     */
    public KeycloakIntegrator(URI baseUrl) {
        this.baseUrl = baseUrl;
    }
}
