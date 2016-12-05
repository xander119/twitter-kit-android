/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Search;

import retrofit2.Call;

public class TestSearchTimeline extends SearchTimeline {

    TestSearchTimeline(String query, String resultType, String lang,
            Integer count, String untilDate) {
        super(query, resultType, lang, count, untilDate);
    }

    @Override
    public Call<Search> createSearchRequest(Long sinceId, Long maxId) {
        return super.createSearchRequest(sinceId, maxId);
    }
}
