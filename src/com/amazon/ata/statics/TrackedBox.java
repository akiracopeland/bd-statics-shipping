package com.amazon.ata.statics;

import java.util.UUID;

public class TrackedBox {

//    A getter called getBoxId() that returns the boxId
//    A getter called getTrackingId() that returns the trackingId
//    A private method called createTrackingId() that returns a trackingId by concatenating the boxId with a random id.
//    The UUID class has a method, randomUUID() that can be used to generate a random id.
//    A constructor that accepts a single argument, boxId, and initializes both boxId and trackingId.

    private String boxId;

    private String trackingId;


    /**
     * Constructs a TrackedBox object. A trackingId will also be generated for this TrackedBox object.
     * @param boxId - the id of the box
     */
    public TrackedBox(String boxId) {
        this.boxId = boxId;
        this.trackingId = createTrackingId(boxId);
    }

    UUID randomUUID = UUID.randomUUID();

    private String createTrackingId(String id) {
        return id + randomUUID;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public String getBoxId() {
        return boxId;
    }

}
