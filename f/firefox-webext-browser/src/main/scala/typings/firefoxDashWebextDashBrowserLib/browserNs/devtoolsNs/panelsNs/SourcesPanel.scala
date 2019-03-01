package typings
package firefoxDashWebextDashBrowserLib.browserNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Sources panel. */
trait SourcesPanel extends js.Object {
  /**
    * Creates a pane within panel's sidebar.
    * @param title Text that is displayed in sidebar caption.
    * @deprecated Unsupported on Firefox at this time.
    */
  var createSidebarPane: js.UndefOr[
    js.Function1[/* title */ java.lang.String, js.Promise[js.UndefOr[ExtensionSidebarPane]]]
  ] = js.undefined
  /**
    * Fired when an object is selected in the panel.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onSelectionChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]]
}

object SourcesPanel {
  @scala.inline
  def apply(
    onSelectionChanged: firefoxDashWebextDashBrowserLib.WebExtEvent[js.Function0[scala.Unit]],
    createSidebarPane: js.Function1[/* title */ java.lang.String, js.Promise[js.UndefOr[ExtensionSidebarPane]]] = null
  ): SourcesPanel = {
    val __obj = js.Dynamic.literal(onSelectionChanged = onSelectionChanged)
    if (createSidebarPane != null) __obj.updateDynamic("createSidebarPane")(createSidebarPane)
    __obj.asInstanceOf[SourcesPanel]
  }
}

