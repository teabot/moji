/*
 * Copyright 2009 Last.fm
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package fm.last.moji;

import java.io.IOException;

/**
 * Factory interface for creating {@link fm.last.moji.Moji Mojis}.
 */
public interface MojiFactory {

  /**
   * Gets a Moji instance using whatever strategy the implemention provides.
   * 
   * @return The Moji instance.
   * @throws IOException If there was a problem creating the instance.
   */
  Moji getInstance() throws IOException;

  /**
   * Gets a Moji instance using whatever strategy the implemention provides.
   * 
   * @return The Moji instance.
   * @throws IOException If there was a problem creating the instance.
   */
  Moji getInstance(String domain) throws IOException;

}
