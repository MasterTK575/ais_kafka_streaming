package org.openapitools.client.custom;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import org.openapitools.client.model.SubscriptionMessage;

import javax.annotation.CheckForNull;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonSerialize
public class SubscriptionAction {
    private boolean keepAlive;

    @CheckForNull
    private SubscriptionMessage subscriptionMessage;
}
