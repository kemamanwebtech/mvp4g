/*
 * Copyright (c) 2009 - 2017 - Pierre-Laurent Coirer, Frank Hossfeld
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.mvp4g.client.gwt_event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Represents a widget load event. This event should be fired when a widget is added to the DOM.
 */
public class LoadEvent
  extends GwtEvent<LoadHandler> {

  public static Type<LoadHandler> TYPE = new Type<LoadHandler>();

  /*
   * (non-Javadoc)
   * @see com.google.gwt.event.shared.GwtEvent#getAssociatedType()
   */
  @Override
  public Type<LoadHandler> getAssociatedType() {
    return TYPE;
  }

  /*
   * (non-Javadoc)
   * @see com.google.gwt.event.shared.GwtEvent#dispatch(com.google.gwt.event.shared.EventHandler)
   */
  @Override
  protected void dispatch(LoadHandler handler) {
    handler.onLoad();
  }

}
