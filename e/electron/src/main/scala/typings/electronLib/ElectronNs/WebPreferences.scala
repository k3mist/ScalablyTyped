package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPreferences extends js.Object {
  /**
    * A list of strings that will be appended to process.argv in the renderer process
    * of this app. Useful for passing small bits of data down to renderer process
    * preload scripts.
    */
  var additionalArguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When specified, web pages with the same affinity will run in the same renderer
    * process. Note that due to reusing the renderer process, certain webPreferences
    * options will also be shared between the web pages even when you specified
    * different values for them, including but not limited to preload, sandbox and
    * nodeIntegration. So it is suggested to use exact same webPreferences for web
    * pages with the same affinity.
    */
  var affinity: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allow an https page to run JavaScript, CSS or plugins from http URLs. Default is
    * false.
    */
  var allowRunningInsecureContent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to throttle animations and timers when the page becomes background. This
    * also affects the . Defaults to true.
    */
  var backgroundThrottling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to run Electron APIs and the specified preload script in a separate
    * JavaScript context. Defaults to false. The context that the preload script runs
    * in will still have full access to the document and window globals but it will
    * use its own set of JavaScript builtins (Array, Object, JSON, etc.) and will be
    * isolated from any changes made to the global environment by the loaded page. The
    * Electron API will only be available in the preload script and not the loaded
    * page. This option should be used when loading potentially untrusted remote
    * content to ensure the loaded content cannot tamper with the preload script and
    * any Electron APIs being used. This option uses the same technique used by . You
    * can access this context in the dev tools by selecting the 'Electron Isolated
    * Context' entry in the combo box at the top of the Console tab.
    */
  var contextIsolation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defaults to ISO-8859-1.
    */
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the default font for the font-family.
    */
  var defaultFontFamily: js.UndefOr[DefaultFontFamily] = js.undefined
  /**
    * Defaults to 16.
    */
  var defaultFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defaults to 13.
    */
  var defaultMonospaceFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to enable DevTools. If it is set to false, can not use
    * BrowserWindow.webContents.openDevTools() to open DevTools. Default is true.
    */
  var devTools: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * disable. The full list of supported feature strings can be found in the file.
    */
  var disableBlinkFeatures: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of feature strings separated by ,, like CSSVariables,KeyboardEventKey to
    * enable. The full list of supported feature strings can be found in the file.
    */
  var enableBlinkFeatures: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable the module. Default is true.
    */
  var enableRemoteModule: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables Chromium's experimental features. Default is false.
    */
  var experimentalFeatures: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables image support. Default is true.
    */
  var images: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables JavaScript support. Default is true.
    */
  var javascript: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defaults to 0.
    */
  var minimumFontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to use native window.open(). If set to true, the webPreferences of child
    * window will always be the same with parent window, regardless of the parameters
    * passed to window.open(). Defaults to false. This option is currently
    * experimental.
    */
  var nativeWindowOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether dragging and dropping a file or link onto the page causes a navigation.
    * Default is false.
    */
  var navigateOnDragDrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether node integration is enabled. Default is true.
    */
  var nodeIntegration: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether node integration is enabled in web workers. Default is false. More about
    * this can be found in .
    */
  var nodeIntegrationInWorker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to enable offscreen rendering for the browser window. Defaults to false.
    * See the for more details.
    */
  var offscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the session used by the page according to the session's partition string.
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. If there is no
    * persist: prefix, the page will use an in-memory session. By assigning the same
    * partition, multiple pages can share the same session. Default is the default
    * session.
    */
  var partition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether plugins should be enabled. Default is false.
    */
  var plugins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies a script that will be loaded before other scripts run in the page.
    * This script will always have access to node APIs no matter whether node
    * integration is turned on or off. The value should be the absolute file path to
    * the script. When node integration is turned off, the preload script can
    * reintroduce Node global symbols back to the global scope. See example .
    */
  var preload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable browser style consecutive dialog protection. Default is false.
    */
  var safeDialogs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The message to display when consecutive dialog protection is triggered. If not
    * defined the default message would be used, note that currently the default
    * message is in English and not localized.
    */
  var safeDialogsMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set, this will sandbox the renderer associated with the window, making it
    * compatible with the Chromium OS-level sandbox and disabling the Node.js engine.
    * This is not the same as the nodeIntegration option and the APIs available to the
    * preload script are more limited. Read more about the option . This option is
    * currently experimental and may change or be removed in future Electron releases.
    */
  var sandbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables scroll bounce (rubber banding) effect on macOS. Default is false.
    */
  var scrollBounce: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the session used by the page. Instead of passing the Session object
    * directly, you can also choose to use the partition option instead, which accepts
    * a partition string. When both session and partition are provided, session will
    * be preferred. Default is the default session.
    */
  var session: js.UndefOr[Session] = js.undefined
  /**
    * Make TextArea elements resizable. Default is true.
    */
  var textAreasAreResizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When false, it will disable the same-origin policy (usually using testing
    * websites by people), and set allowRunningInsecureContent to true if this options
    * has not been set by user. Default is true.
    */
  var webSecurity: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables WebAudio support. Default is true.
    */
  var webaudio: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables WebGL support. Default is true.
    */
  var webgl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to enable the . Defaults to the value of the nodeIntegration option. The
    * preload script configured for the will have node integration enabled when it is
    * executed so you should ensure remote/untrusted content is not able to create a
    * tag with a possibly malicious preload script. You can use the
    * will-attach-webview event on to strip away the preload script and to validate or
    * alter the 's initial settings.
    */
  var webviewTag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default zoom factor of the page, 3.0 represents 300%. Default is 1.0.
    */
  var zoomFactor: js.UndefOr[scala.Double] = js.undefined
}

object WebPreferences {
  @scala.inline
  def apply(
    additionalArguments: js.Array[java.lang.String] = null,
    affinity: java.lang.String = null,
    allowRunningInsecureContent: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundThrottling: js.UndefOr[scala.Boolean] = js.undefined,
    contextIsolation: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    defaultFontFamily: DefaultFontFamily = null,
    defaultFontSize: scala.Int | scala.Double = null,
    defaultMonospaceFontSize: scala.Int | scala.Double = null,
    devTools: js.UndefOr[scala.Boolean] = js.undefined,
    disableBlinkFeatures: java.lang.String = null,
    enableBlinkFeatures: java.lang.String = null,
    enableRemoteModule: js.UndefOr[scala.Boolean] = js.undefined,
    experimentalFeatures: js.UndefOr[scala.Boolean] = js.undefined,
    images: js.UndefOr[scala.Boolean] = js.undefined,
    javascript: js.UndefOr[scala.Boolean] = js.undefined,
    minimumFontSize: scala.Int | scala.Double = null,
    nativeWindowOpen: js.UndefOr[scala.Boolean] = js.undefined,
    navigateOnDragDrop: js.UndefOr[scala.Boolean] = js.undefined,
    nodeIntegration: js.UndefOr[scala.Boolean] = js.undefined,
    nodeIntegrationInWorker: js.UndefOr[scala.Boolean] = js.undefined,
    offscreen: js.UndefOr[scala.Boolean] = js.undefined,
    partition: java.lang.String = null,
    plugins: js.UndefOr[scala.Boolean] = js.undefined,
    preload: java.lang.String = null,
    safeDialogs: js.UndefOr[scala.Boolean] = js.undefined,
    safeDialogsMessage: java.lang.String = null,
    sandbox: js.UndefOr[scala.Boolean] = js.undefined,
    scrollBounce: js.UndefOr[scala.Boolean] = js.undefined,
    session: Session = null,
    textAreasAreResizable: js.UndefOr[scala.Boolean] = js.undefined,
    webSecurity: js.UndefOr[scala.Boolean] = js.undefined,
    webaudio: js.UndefOr[scala.Boolean] = js.undefined,
    webgl: js.UndefOr[scala.Boolean] = js.undefined,
    webviewTag: js.UndefOr[scala.Boolean] = js.undefined,
    zoomFactor: scala.Int | scala.Double = null
  ): WebPreferences = {
    val __obj = js.Dynamic.literal()
    if (additionalArguments != null) __obj.updateDynamic("additionalArguments")(additionalArguments)
    if (affinity != null) __obj.updateDynamic("affinity")(affinity)
    if (!js.isUndefined(allowRunningInsecureContent)) __obj.updateDynamic("allowRunningInsecureContent")(allowRunningInsecureContent)
    if (!js.isUndefined(backgroundThrottling)) __obj.updateDynamic("backgroundThrottling")(backgroundThrottling)
    if (!js.isUndefined(contextIsolation)) __obj.updateDynamic("contextIsolation")(contextIsolation)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (defaultFontFamily != null) __obj.updateDynamic("defaultFontFamily")(defaultFontFamily)
    if (defaultFontSize != null) __obj.updateDynamic("defaultFontSize")(defaultFontSize.asInstanceOf[js.Any])
    if (defaultMonospaceFontSize != null) __obj.updateDynamic("defaultMonospaceFontSize")(defaultMonospaceFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(devTools)) __obj.updateDynamic("devTools")(devTools)
    if (disableBlinkFeatures != null) __obj.updateDynamic("disableBlinkFeatures")(disableBlinkFeatures)
    if (enableBlinkFeatures != null) __obj.updateDynamic("enableBlinkFeatures")(enableBlinkFeatures)
    if (!js.isUndefined(enableRemoteModule)) __obj.updateDynamic("enableRemoteModule")(enableRemoteModule)
    if (!js.isUndefined(experimentalFeatures)) __obj.updateDynamic("experimentalFeatures")(experimentalFeatures)
    if (!js.isUndefined(images)) __obj.updateDynamic("images")(images)
    if (!js.isUndefined(javascript)) __obj.updateDynamic("javascript")(javascript)
    if (minimumFontSize != null) __obj.updateDynamic("minimumFontSize")(minimumFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(nativeWindowOpen)) __obj.updateDynamic("nativeWindowOpen")(nativeWindowOpen)
    if (!js.isUndefined(navigateOnDragDrop)) __obj.updateDynamic("navigateOnDragDrop")(navigateOnDragDrop)
    if (!js.isUndefined(nodeIntegration)) __obj.updateDynamic("nodeIntegration")(nodeIntegration)
    if (!js.isUndefined(nodeIntegrationInWorker)) __obj.updateDynamic("nodeIntegrationInWorker")(nodeIntegrationInWorker)
    if (!js.isUndefined(offscreen)) __obj.updateDynamic("offscreen")(offscreen)
    if (partition != null) __obj.updateDynamic("partition")(partition)
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (!js.isUndefined(safeDialogs)) __obj.updateDynamic("safeDialogs")(safeDialogs)
    if (safeDialogsMessage != null) __obj.updateDynamic("safeDialogsMessage")(safeDialogsMessage)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    if (!js.isUndefined(scrollBounce)) __obj.updateDynamic("scrollBounce")(scrollBounce)
    if (session != null) __obj.updateDynamic("session")(session)
    if (!js.isUndefined(textAreasAreResizable)) __obj.updateDynamic("textAreasAreResizable")(textAreasAreResizable)
    if (!js.isUndefined(webSecurity)) __obj.updateDynamic("webSecurity")(webSecurity)
    if (!js.isUndefined(webaudio)) __obj.updateDynamic("webaudio")(webaudio)
    if (!js.isUndefined(webgl)) __obj.updateDynamic("webgl")(webgl)
    if (!js.isUndefined(webviewTag)) __obj.updateDynamic("webviewTag")(webviewTag)
    if (zoomFactor != null) __obj.updateDynamic("zoomFactor")(zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPreferences]
  }
}

