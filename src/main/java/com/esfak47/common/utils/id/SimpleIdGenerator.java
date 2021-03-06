package com.esfak47.common.utils.id;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author tonywang
 */
public class SimpleIdGenerator implements IdGenerator {

    private final AtomicLong mostSigBits = new AtomicLong(0);

    private final AtomicLong leastSigBits = new AtomicLong(0);

    @Override
    public UUID generateUUID() {
        long leastSigBits = this.leastSigBits.incrementAndGet();
        if (leastSigBits == 0) {
            this.mostSigBits.incrementAndGet();
        }
        return new UUID(this.mostSigBits.get(), leastSigBits);
    }

}