// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.implementation.models.VectorQueryKind;
import java.io.IOException;
import java.util.List;

/**
 * The query parameters to use for vector search when a raw vector value is provided.
 */
@Fluent
public final class VectorizedQuery extends VectorQuery {

    /*
     * The vector representation of a search query.
     */
    private final List<Float> vector;

    /**
     * Creates an instance of VectorizedQuery class.
     *
     * @param vector the vector value to set.
     */
    public VectorizedQuery(List<Float> vector) {
        this.vector = vector;
    }

    /**
     * Get the vector property: The vector representation of a search query.
     *
     * @return the vector value.
     */
    public List<Float> getVector() {
        return this.vector;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setKNearestNeighborsCount(Integer kNearestNeighborsCount) {
        super.setKNearestNeighborsCount(kNearestNeighborsCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setFields(String... fields) {
        super.setFields(fields);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setExhaustive(Boolean exhaustive) {
        super.setExhaustive(exhaustive);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VectorizedQuery setOversampling(Double oversampling) {
        super.setOversampling(oversampling);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", VectorQueryKind.VECTOR == null ? null : VectorQueryKind.VECTOR.toString());
        jsonWriter.writeNumberField("k", getKNearestNeighborsCount());
        jsonWriter.writeStringField("fields", getFields());
        jsonWriter.writeBooleanField("exhaustive", isExhaustive());
        jsonWriter.writeNumberField("oversampling", getOversampling());
        jsonWriter.writeArrayField("vector", this.vector, (writer, element) -> writer.writeFloat(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorizedQuery from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorizedQuery if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the VectorizedQuery.
     */
    public static VectorizedQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Integer kNearestNeighborsCount = null;
            String fields = null;
            Boolean exhaustive = null;
            Double oversampling = null;
            boolean vectorFound = false;
            List<Float> vector = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"vector".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'vector'. The found 'kind' was '" + kind
                                + "'.");
                    }
                } else if ("k".equals(fieldName)) {
                    kNearestNeighborsCount = reader.getNullable(JsonReader::getInt);
                } else if ("fields".equals(fieldName)) {
                    fields = reader.getString();
                } else if ("exhaustive".equals(fieldName)) {
                    exhaustive = reader.getNullable(JsonReader::getBoolean);
                } else if ("oversampling".equals(fieldName)) {
                    oversampling = reader.getNullable(JsonReader::getDouble);
                } else if ("vector".equals(fieldName)) {
                    vector = reader.readArray(reader1 -> reader1.getFloat());
                    vectorFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (vectorFound) {
                VectorizedQuery deserializedVectorizedQuery = new VectorizedQuery(vector);
                deserializedVectorizedQuery.setKNearestNeighborsCount(kNearestNeighborsCount);
                deserializedVectorizedQuery.setFields(fields);
                deserializedVectorizedQuery.setExhaustive(exhaustive);
                deserializedVectorizedQuery.setOversampling(oversampling);
                return deserializedVectorizedQuery;
            }
            throw new IllegalStateException("Missing required property: vector");
        });
    }
}
