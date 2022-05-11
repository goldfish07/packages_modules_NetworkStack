/*
 * Copyright (C) 2022 The Android Open Source Project
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

package com.android.networkstack.apishim;

import android.net.Ikev2VpnProfile;
import android.os.Build;

import androidx.annotation.RequiresApi;

/**
 * A shim for Ikev2VpnProfile
 */
// TODO: when available in all active branches: @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
@RequiresApi(Build.VERSION_CODES.CUR_DEVELOPMENT)
public class Ikev2VpnProfileShimImpl
        extends com.android.networkstack.apishim.api33.Ikev2VpnProfileShimImpl {
    public Ikev2VpnProfileShimImpl(Ikev2VpnProfile profile) {
       super(profile);
    }
}
