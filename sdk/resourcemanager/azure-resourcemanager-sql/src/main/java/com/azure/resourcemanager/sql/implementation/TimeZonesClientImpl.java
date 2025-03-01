// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.sql.fluent.TimeZonesClient;
import com.azure.resourcemanager.sql.fluent.models.TimeZoneInner;
import com.azure.resourcemanager.sql.models.TimeZoneListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TimeZonesClient. */
public final class TimeZonesClientImpl implements TimeZonesClient {
    /** The proxy service used to perform REST calls. */
    private final TimeZonesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of TimeZonesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    TimeZonesClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(TimeZonesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientTimeZones to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientT")
    private interface TimeZonesService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/timeZones")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TimeZoneListResult>> listByLocation(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Sql/locations/{locationName}/timeZones/{timeZoneId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TimeZoneInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("locationName") String locationName,
            @PathParam("timeZoneId") String timeZoneId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<TimeZoneListResult>> listByLocationNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TimeZoneInner>> listByLocationSinglePageAsync(String locationName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByLocation(
                            this.client.getEndpoint(),
                            locationName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<TimeZoneInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TimeZoneInner>> listByLocationSinglePageAsync(String locationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByLocation(
                this.client.getEndpoint(),
                locationName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TimeZoneInner> listByLocationAsync(String locationName) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(locationName), nextLink -> listByLocationNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<TimeZoneInner> listByLocationAsync(String locationName, Context context) {
        return new PagedFlux<>(
            () -> listByLocationSinglePageAsync(locationName, context),
            nextLink -> listByLocationNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TimeZoneInner> listByLocation(String locationName) {
        return new PagedIterable<>(listByLocationAsync(locationName));
    }

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TimeZoneInner> listByLocation(String locationName, Context context) {
        return new PagedIterable<>(listByLocationAsync(locationName, context));
    }

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimeZoneInner>> getWithResponseAsync(String locationName, String timeZoneId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (timeZoneId == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeZoneId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            locationName,
                            timeZoneId,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<TimeZoneInner>> getWithResponseAsync(
        String locationName, String timeZoneId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        if (timeZoneId == null) {
            return Mono.error(new IllegalArgumentException("Parameter timeZoneId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                locationName,
                timeZoneId,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimeZoneInner> getAsync(String locationName, String timeZoneId) {
        return getWithResponseAsync(locationName, timeZoneId).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TimeZoneInner> getWithResponse(String locationName, String timeZoneId, Context context) {
        return getWithResponseAsync(locationName, timeZoneId, context).block();
    }

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TimeZoneInner get(String locationName, String timeZoneId) {
        return getWithResponse(locationName, timeZoneId, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of time zones along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TimeZoneInner>> listByLocationNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByLocationNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<TimeZoneInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of time zones along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<TimeZoneInner>> listByLocationNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByLocationNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
