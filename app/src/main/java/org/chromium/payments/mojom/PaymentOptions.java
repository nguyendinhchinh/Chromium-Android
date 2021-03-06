
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/payments/payment_request.mojom
//

package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class PaymentOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean requestPayerName;
    public boolean requestPayerEmail;
    public boolean requestPayerPhone;
    public boolean requestShipping;
    public int shippingType;

    private PaymentOptions(int version) {
        super(STRUCT_SIZE, version);
    }

    public PaymentOptions() {
        this(0);
    }

    public static PaymentOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PaymentOptions deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PaymentOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PaymentOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new PaymentOptions(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.requestPayerName = decoder0.readBoolean(8, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.requestPayerEmail = decoder0.readBoolean(8, 1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.requestPayerPhone = decoder0.readBoolean(8, 2);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.requestShipping = decoder0.readBoolean(8, 3);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.shippingType = decoder0.readInt(12);
                    PaymentShippingType.validate(result.shippingType);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.requestPayerName, 8, 0);
        
        encoder0.encode(this.requestPayerEmail, 8, 1);
        
        encoder0.encode(this.requestPayerPhone, 8, 2);
        
        encoder0.encode(this.requestShipping, 8, 3);
        
        encoder0.encode(this.shippingType, 12);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        PaymentOptions other = (PaymentOptions) object;
        if (this.requestPayerName!= other.requestPayerName)
            return false;
        if (this.requestPayerEmail!= other.requestPayerEmail)
            return false;
        if (this.requestPayerPhone!= other.requestPayerPhone)
            return false;
        if (this.requestShipping!= other.requestShipping)
            return false;
        if (this.shippingType!= other.shippingType)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.requestPayerName);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.requestPayerEmail);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.requestPayerPhone);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.requestShipping);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.shippingType);
        return result;
    }
}