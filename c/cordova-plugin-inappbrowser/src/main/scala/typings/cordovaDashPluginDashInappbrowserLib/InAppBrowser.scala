package typings
package cordovaDashPluginDashInappbrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object returned from a call to window.open.
  * NOTE: The InAppBrowser window behaves like a standard web browser, and can't access Cordova APIs.
  */
@js.native
trait InAppBrowser extends Window {
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      the event to listen for
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an Event object as a parameter.
    */
  def addEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      the event to listen for
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.exit,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      the event to listen for
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("addEventListener")
  def addEventListener_loaderror(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loaderror,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  // addEventListener overloads
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      the event to listen for
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loadstart,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Adds a listener for an event from the InAppBrowser.
    * @param type      the event to listen for
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("addEventListener")
  def addEventListener_loadstop(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loadstop,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /** Closes the InAppBrowser window. */
  def close(): scala.Unit = js.native
  /**
    * Injects JavaScript code into the InAppBrowser window.
    * @param script    Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the JavaScript code is injected.
    *                  If the injected script is of type code, the callback executes with
    *                  a single parameter, which is the return value of the script, wrapped in an Array.
    *                  For multi-line scripts, this is the return value of the last statement,
    *                  or the last expression evaluated.
    */
  def executeScript(script: Anon_Code, callback: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Injects JavaScript code into the InAppBrowser window.
    * @param script    Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the JavaScript code is injected.
    *                  If the injected script is of type code, the callback executes with
    *                  a single parameter, which is the return value of the script, wrapped in an Array.
    *                  For multi-line scripts, this is the return value of the last statement,
    *                  or the last expression evaluated.
    */
  def executeScript(script: Anon_File, callback: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Hides the InAppBrowser window. Calling this has no effect if the InAppBrowser was already hidden. */
  def hide(): scala.Unit = js.native
  /**
    * Injects CSS into the InAppBrowser window.
    * @param css       Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the CSS is injected.
    */
  def insertCSS(css: Anon_Code, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Injects CSS into the InAppBrowser window.
    * @param css       Details of the script to run, specifying either a file or code key.
    * @param callback  The function that executes after the CSS is injected.
    */
  def insertCSS(css: Anon_File, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onexit(`type`: InAppBrowserEvent): scala.Unit = js.native
  def onloaderror(`type`: InAppBrowserEvent): scala.Unit = js.native
  def onloadstart(`type`: InAppBrowserEvent): scala.Unit = js.native
  def onloadstop(`type`: InAppBrowserEvent): scala.Unit = js.native
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an Event object as a parameter.
    */
  def removeEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.exit,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("removeEventListener")
  def removeEventListener_loaderror(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loaderror,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  // removeEventListener overloads
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("removeEventListener")
  def removeEventListener_loadstart(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loadstart,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes a listener for an event from the InAppBrowser.
    * @param type      The event to stop listening for.
    *                  loadstart: event fires when the InAppBrowser starts to load a URL.
    *                  loadstop: event fires when the InAppBrowser finishes loading a URL.
    *                  loaderror: event fires when the InAppBrowser encounters an error when loading a URL.
    *                  exit: event fires when the InAppBrowser window is closed.
    * @param callback  the function that executes when the event fires. The function is
    *                  passed an InAppBrowserEvent object as a parameter.
    */
  @JSName("removeEventListener")
  def removeEventListener_loadstop(
    `type`: cordovaDashPluginDashInappbrowserLib.cordovaDashPluginDashInappbrowserLibStrings.loadstop,
    callback: js.Function1[/* event */ InAppBrowserEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Displays an InAppBrowser window that was opened hidden. Calling this has no effect
    * if the InAppBrowser was already visible.
    */
  def show(): scala.Unit = js.native
}

