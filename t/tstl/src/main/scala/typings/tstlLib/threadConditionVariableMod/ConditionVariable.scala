package typings
package tstlLib.threadConditionVariableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/ConditionVariable", "ConditionVariable")
@js.native
/**
  * Default Constructor.
  */
class ConditionVariable () extends js.Object {
  /**
    * @hidden
    */
  var _Wait: js.Any = js.native
  /**
    * @hidden
    */
  var _Wait_until: js.Any = js.native
  /**
    * @hidden
    */
  var resolvers_ : js.Any = js.native
  /**
    * Notify, wake all
    */
  def notify_all(): js.Promise[scala.Unit] = js.native
  /**
    * Notify, wake one.
    */
  def notify_one(): js.Promise[scala.Unit] = js.native
  /**
    * Wait until predicator returns true.
    *
    * This method is equivalent to:
    *
    ```typescript
    while (!await predicator())
    await this.wait();
    ```
    *
    * @param predicator A predicator function determines completion.
    */
  def wait(predicator: Predicator): js.Promise[scala.Unit] = js.native
  /**
    * Wait for timeout or until notified.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether awaken by notification or timeout.
    */
  def wait_for(ms: scala.Double): js.Promise[scala.Boolean] = js.native
  /**
    * Wait until timeout or predicator returns true.
    *
    * This method is equivalent to:
    ```typescript
    let at: Date = new Date(Date.now() + ms);
    while (!await predicator())
    {
    if (!await this.wait_until(at))
    return await predicator();
    }
    return true;
    ```
    *
    * @param ms The maximum miliseconds for waiting.
    * @param predicator A predicator function determines the completion.
    * @return Returned value of the *predicator*.
    */
  def wait_for(ms: scala.Double, predicator: Predicator): js.Promise[scala.Boolean] = js.native
  /**
    * Wait until notified or time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether awaken by notification or time expiration.
    */
  def wait_until(at: stdLib.Date): js.Promise[scala.Boolean] = js.native
  /**
    * Wait until time expiration or predicator returns true.
    *
    * This method is equivalent to:
    ```typescript
    while (!await predicator())
    {
    if (!await this.wait_until(at))
    return await predicator();
    }
    return true;
    ```
    *
    * @param at The maximum time point to wait.
    * @param predicator A predicator function determines the completion.
    * @return Returned value of the *predicator*.
    */
  def wait_until(at: stdLib.Date, predicator: Predicator): js.Promise[scala.Boolean] = js.native
}

