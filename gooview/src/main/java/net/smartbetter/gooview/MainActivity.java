/**
 * Copyright 2015 smartbetter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.smartbetter.gooview;

import net.smartbetter.gooview.GooView.OnReleaseListener;
import net.smartbetter.gooview.util.ToastUtil;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GooView gooView = new GooView(this);
        gooView.setOnReleaseListener(new OnReleaseListener() {
            @Override
            public void onReset(boolean isOutOfRange) {
                ToastUtil.showToast(getApplicationContext(), "返回原地.." + isOutOfRange);
            }

            @Override
            public void onDisappear() {
                ToastUtil.showToast(getApplicationContext(), "消失了..");
            }
        });
        setContentView(gooView);
    }

}
