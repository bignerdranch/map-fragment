/*
 * Copyright (C) 2012 Big Nerd Ranch, Inc.
 * - Updated to use the library project.
 * 
 * Based on previous work:
 * Copyright (C) 2011 Ievgenii Nazaruk
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
 */

package com.bignerdranch.android.mapfragment;

import android.os.Bundle;
import com.google.android.maps.MapActivity;

public class SimpleMapActivity extends MapActivity {
    
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.map_activity);
    }
    
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }
}
