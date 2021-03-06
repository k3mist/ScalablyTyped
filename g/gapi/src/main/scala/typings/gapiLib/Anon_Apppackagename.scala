package typings
package gapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apppackagename extends js.Object {
  /**
    * If you have an Android app, you can drive automatic Android downloads from your web sign-in flow.
    */
  var apppackagename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A function in the global namespace, which is called when the sign-in button is rendered and also called after a sign-in flow completes.
    */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Your OAuth 2.0 client ID that you obtained from the Google Developers Console.
    */
  var clientid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Directs the sign-in button to store user and session information in a session cookie and HTML5 session storage on the user's client for the purpose of minimizing HTTP traffic and distinguishing between multiple Google accounts a user might be signed into.
    */
  var cookiepolicy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, all previously granted scopes remain granted in each incremental request, for incremental authorization. The default value true is correct for most use cases; use false only if employing delegated auth, where you pass the bearer token to a less-trusted component with lower programmatic authority.
    */
  var includegrantedscopes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If your app will write moments, list the full URI of the types of moments that you intend to write.
    */
  var requestvisibleactions: js.UndefOr[js.Any] = js.undefined
  /**
    * The OAuth 2.0 scopes for the APIs that you would like to use as a space-delimited list.
    */
  var scope: js.UndefOr[js.Any] = js.undefined
}

object Anon_Apppackagename {
  @scala.inline
  def apply(
    apppackagename: java.lang.String = null,
    callback: () => scala.Unit = null,
    clientid: java.lang.String = null,
    cookiepolicy: java.lang.String = null,
    includegrantedscopes: js.UndefOr[scala.Boolean] = js.undefined,
    requestvisibleactions: js.Any = null,
    scope: js.Any = null
  ): Anon_Apppackagename = {
    val __obj = js.Dynamic.literal()
    if (apppackagename != null) __obj.updateDynamic("apppackagename")(apppackagename)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (clientid != null) __obj.updateDynamic("clientid")(clientid)
    if (cookiepolicy != null) __obj.updateDynamic("cookiepolicy")(cookiepolicy)
    if (!js.isUndefined(includegrantedscopes)) __obj.updateDynamic("includegrantedscopes")(includegrantedscopes)
    if (requestvisibleactions != null) __obj.updateDynamic("requestvisibleactions")(requestvisibleactions)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Apppackagename]
  }
}

