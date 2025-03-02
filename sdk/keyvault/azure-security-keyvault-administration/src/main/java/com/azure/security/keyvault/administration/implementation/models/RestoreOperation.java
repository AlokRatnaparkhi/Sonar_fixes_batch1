// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Restore operation. */
@Fluent
public final class RestoreOperation implements JsonSerializable<RestoreOperation> {
    /*
     * Status of the restore operation.
     */
    private String status;

    /*
     * The status details of restore operation.
     */
    private String statusDetails;

    /*
     * Error encountered, if any, during the restore operation.
     */
    private Error error;

    /*
     * Identifier for the restore operation.
     */
    private String jobId;

    /*
     * The start time of the restore operation
     */
    private Long startTime;

    /*
     * The end time of the restore operation
     */
    private Long endTime;

    /** Creates an instance of RestoreOperation class. */
    public RestoreOperation() {}

    /**
     * Get the status property: Status of the restore operation.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the restore operation.
     *
     * @param status the status value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails property: The status details of restore operation.
     *
     * @return the statusDetails value.
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails property: The status details of restore operation.
     *
     * @param statusDetails the statusDetails value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the error property: Error encountered, if any, during the restore operation.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: Error encountered, if any, during the restore operation.
     *
     * @param error the error value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the jobId property: Identifier for the restore operation.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: Identifier for the restore operation.
     *
     * @param jobId the jobId value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the startTime property: The start time of the restore operation.
     *
     * @return the startTime value.
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the restore operation.
     *
     * @param startTime the startTime value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the restore operation.
     *
     * @return the endTime value.
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the restore operation.
     *
     * @param endTime the endTime value to set.
     * @return the RestoreOperation object itself.
     */
    public RestoreOperation setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("statusDetails", this.statusDetails);
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("jobId", this.jobId);
        jsonWriter.writeNumberField("startTime", this.startTime);
        jsonWriter.writeNumberField("endTime", this.endTime);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestoreOperation from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestoreOperation if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestoreOperation.
     */
    public static RestoreOperation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    RestoreOperation deserializedRestoreOperation = new RestoreOperation();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("status".equals(fieldName)) {
                            deserializedRestoreOperation.status = reader.getString();
                        } else if ("statusDetails".equals(fieldName)) {
                            deserializedRestoreOperation.statusDetails = reader.getString();
                        } else if ("error".equals(fieldName)) {
                            deserializedRestoreOperation.error = Error.fromJson(reader);
                        } else if ("jobId".equals(fieldName)) {
                            deserializedRestoreOperation.jobId = reader.getString();
                        } else if ("startTime".equals(fieldName)) {
                            deserializedRestoreOperation.startTime = reader.getNullable(JsonReader::getLong);
                        } else if ("endTime".equals(fieldName)) {
                            deserializedRestoreOperation.endTime = reader.getNullable(JsonReader::getLong);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedRestoreOperation;
                });
    }
}
