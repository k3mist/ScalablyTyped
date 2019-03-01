package typings
package googleDotScriptDotClientDashSideLib.googleNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runner
  extends /**
  * Executes the server-side Apps Script function with the corresponding name.
  */
/* functionName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]] {
  /**
    * Sets a callback function to run if the server-side function throws an exception.
    * Without a failure handler, failures are logged to the JavaScript console.
    * To override this, call withFailureHandler(null) or supply a failure handler that does nothing.
    * @param handler a client-side callback function to run if the server-side function throws an exception;
    * the Error object is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withFailureHandler(handler: js.Function2[/* error */ stdLib.Error, /* object */ js.UndefOr[js.Any], scala.Unit]): Runner
  /**
    * Sets a callback function to run if the server-side function returns successfully.
    * @param handler a client-side callback function to run if the server-side function returns successfully;
    * the server's return value is passed to the function as the first argument, and the user object (if any) is passed as a second argument
    */
  def withSuccessHandler(handler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], scala.Unit]): Runner
  /**
    * Sets an object to pass as a second parameter to the success and failure handlers.
    * @param object an object to pass as a second parameter to the success and failure handlers;
    * because user objects are not sent to the server, they are not subject to the restrictions on parameters and return values for server calls.
    * User objects cannot, however, be objects constructed with the new operator
    */
  def withUserObject(`object`: js.Any): Runner
}

object Runner {
  @scala.inline
  def apply(
    withFailureHandler: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* object */ js.UndefOr[js.Any], scala.Unit], 
      Runner
    ],
    withSuccessHandler: js.Function1[
      js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], scala.Unit], 
      Runner
    ],
    withUserObject: js.Function1[js.Any, Runner],
    StringDictionary: /**
    * Executes the server-side Apps Script function with the corresponding name.
    */
  /* functionName */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, scala.Unit]] = null
  ): Runner = {
    val __obj = js.Dynamic.literal(withFailureHandler = withFailureHandler, withSuccessHandler = withSuccessHandler, withUserObject = withUserObject)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Runner]
  }
}

