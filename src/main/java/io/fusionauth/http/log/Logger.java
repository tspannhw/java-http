/*
 * Copyright (c) 2022, FusionAuth, All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package io.fusionauth.http.log;

/**
 * A simple logging interface used by the HTTP server/client instances. This removes any coupling between the HTTP server and specific
 * logging frameworks like JUL or SLF4J. Mapping between this logger and other frameworks is simple though.
 *
 * @author Brian Pontarelli
 */
public interface Logger {
  /**
   * Logs a debug message.
   *
   * @param message The message.
   */
  void debug(String message);

  /**
   * Logs a debug message with values.
   *
   * @param message The message.
   * @param values  The values for the message.
   */
  void debug(String message, Object... values);

  /**
   * Logs an error message and stack trace or exception message.
   *
   * @param message   The message.
   * @param throwable The exception for the stack trace or message.
   */
  void error(String message, Throwable throwable);

  /**
   * Logs an error message.
   *
   * @param message The message.
   */
  void error(String message);

  /**
   * Logs an info message.
   *
   * @param message The message.
   */
  void info(String message);

  /**
   * Logs an info message with values.
   *
   * @param message The message.
   * @param values  The values for the message.
   */
  void info(String message, Object... values);

  /**
   * @return If this logger has debug enabled.
   */
  boolean isDebuggable();

  /**
   * Sets the level for this logger.
   *
   * @param level The level.
   */
  void setLevel(Level level);

  /**
   * Logs a trace message with values.
   *
   * @param message The message.
   * @param values  The values for the message.
   */
  void trace(String message, Object... values);

  /**
   * Logs a trace message.
   *
   * @param message The message.
   */
  void trace(String message);
}
