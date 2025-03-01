// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.sql.fluent.DatabaseRecommendedActionsClient;
import com.azure.resourcemanager.sql.fluent.models.RecommendedActionInner;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseRecommendedActionsClient. */
public final class DatabaseRecommendedActionsClientImpl implements DatabaseRecommendedActionsClient {
    /** The proxy service used to perform REST calls. */
    private final DatabaseRecommendedActionsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseRecommendedActionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseRecommendedActionsClientImpl(SqlManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    DatabaseRecommendedActionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseRecommendedActions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    private interface DatabaseRecommendedActionsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<List<RecommendedActionInner>>> listByDatabaseAdvisor(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions"
                + "/{recommendedActionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendedActionInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("recommendedActionName") String recommendedActionName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions"
                + "/{recommendedActionName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RecommendedActionInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advisorName") String advisorName,
            @PathParam("recommendedActionName") String recommendedActionName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") RecommendedActionInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<RecommendedActionInner>>> listByDatabaseAdvisorWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
                        .listByDatabaseAdvisor(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<List<RecommendedActionInner>>> listByDatabaseAdvisorWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
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
            .listByDatabaseAdvisor(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<RecommendedActionInner>> listByDatabaseAdvisorAsync(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<RecommendedActionInner>> listByDatabaseAdvisorWithResponse(
        String resourceGroupName, String serverName, String databaseName, String advisorName, Context context) {
        return listByDatabaseAdvisorWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, context)
            .block();
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Database Recommended Actions.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<RecommendedActionInner> listByDatabaseAdvisor(
        String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorWithResponse(resourceGroupName, serverName, databaseName, advisorName, Context.NONE)
            .getValue();
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecommendedActionInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
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
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            recommendedActionName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
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
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                recommendedActionName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecommendedActionInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecommendedActionInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        Context context) {
        return getWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, context)
            .block();
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database recommended action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecommendedActionInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName) {
        return getWithResponse(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, Context.NONE)
            .getValue();
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RecommendedActionInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            advisorName,
                            recommendedActionName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RecommendedActionInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advisorName == null) {
            return Mono.error(new IllegalArgumentException("Parameter advisorName is required and cannot be null."));
        }
        if (recommendedActionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                recommendedActionName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                parameters,
                accept,
                context);
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RecommendedActionInner> updateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionInner parameters) {
        return updateWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RecommendedActionInner> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionInner parameters,
        Context context) {
        return updateWithResponseAsync(
                resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, parameters, context)
            .block();
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param parameters The requested recommended action resource state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database, Server or Elastic Pool Recommended Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RecommendedActionInner update(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String advisorName,
        String recommendedActionName,
        RecommendedActionInner parameters) {
        return updateWithResponse(
                resourceGroupName,
                serverName,
                databaseName,
                advisorName,
                recommendedActionName,
                parameters,
                Context.NONE)
            .getValue();
    }
}
