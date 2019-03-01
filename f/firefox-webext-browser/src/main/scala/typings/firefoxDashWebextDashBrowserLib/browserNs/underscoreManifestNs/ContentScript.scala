package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the script or CSS to inject. Either the code or the file property must be set, but both may not be
  * set at the same time. Based on InjectDetails, but using underscore rather than camel case naming conventions.
  */
trait ContentScript extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var all_frames: js.UndefOr[scala.Boolean] = js.undefined
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  var exclude_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclude_matches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var include_globs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var `js_`: js.UndefOr[js.Array[ExtensionURL]] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var match_about_blank: js.UndefOr[scala.Boolean] = js.undefined
  var matches: js.Array[MatchPattern]
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var run_at: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt] = js.undefined
}

object ContentScript {
  @scala.inline
  def apply(
    matches: js.Array[MatchPattern],
    all_frames: js.UndefOr[scala.Boolean] = js.undefined,
    css: js.Array[ExtensionURL] = null,
    exclude_globs: js.Array[java.lang.String] = null,
    exclude_matches: js.Array[MatchPattern] = null,
    include_globs: js.Array[java.lang.String] = null,
    `js_`: js.Array[ExtensionURL] = null,
    match_about_blank: js.UndefOr[scala.Boolean] = js.undefined,
    run_at: firefoxDashWebextDashBrowserLib.browserNs.extensionTypesNs.RunAt = null
  ): ContentScript = {
    val __obj = js.Dynamic.literal(matches = matches)
    if (!js.isUndefined(all_frames)) __obj.updateDynamic("all_frames")(all_frames)
    if (css != null) __obj.updateDynamic("css")(css)
    if (exclude_globs != null) __obj.updateDynamic("exclude_globs")(exclude_globs)
    if (exclude_matches != null) __obj.updateDynamic("exclude_matches")(exclude_matches)
    if (include_globs != null) __obj.updateDynamic("include_globs")(include_globs)
    if (`js_` != null) __obj.updateDynamic("js")(`js_`)
    if (!js.isUndefined(match_about_blank)) __obj.updateDynamic("match_about_blank")(match_about_blank)
    if (run_at != null) __obj.updateDynamic("run_at")(run_at)
    __obj.asInstanceOf[ContentScript]
  }
}

