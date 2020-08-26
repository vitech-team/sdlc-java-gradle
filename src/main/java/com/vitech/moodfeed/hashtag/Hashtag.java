package com.vitech.moodfeed.hashtag;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
@Builder
public class Hashtag {

    @Id Long id;
    Long messageId;
    String tag;

}