package typings
package appDashBuilderDashLibLib.outOptionsCommonWindowsInstallerConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonWindowsInstallerConfiguration extends js.Object {
  /**
    * Whether to create desktop shortcut. Set to `always` if to recreate also on reinstall (even if removed by user).
    * @default true
    */
  val createDesktopShortcut: js.UndefOr[scala.Boolean | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.always] = js.undefined
  /**
    * Whether to create start menu shortcut.
    * @default true
    */
  val createStartMenuShortcut: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to create submenu for start menu shortcut and program files directory. If `true`, company name will be used. Or string value.
    * @default false
    */
  val menuCategory: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  val oneClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to install per all users (per-machine).
    * @default false
    */
  val perMachine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to run the installed application after finish. For assisted installer corresponding checkbox will be removed.
    * @default true
    */
  val runAfterFinish: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name that will be used for all shortcuts. Defaults to the application name.
    */
  val shortcutName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object CommonWindowsInstallerConfiguration {
  @scala.inline
  def apply(
    createDesktopShortcut: scala.Boolean | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.always = null,
    createStartMenuShortcut: js.UndefOr[scala.Boolean] = js.undefined,
    menuCategory: scala.Boolean | java.lang.String = null,
    oneClick: js.UndefOr[scala.Boolean] = js.undefined,
    perMachine: js.UndefOr[scala.Boolean] = js.undefined,
    runAfterFinish: js.UndefOr[scala.Boolean] = js.undefined,
    shortcutName: java.lang.String = null
  ): CommonWindowsInstallerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (createDesktopShortcut != null) __obj.updateDynamic("createDesktopShortcut")(createDesktopShortcut.asInstanceOf[js.Any])
    if (!js.isUndefined(createStartMenuShortcut)) __obj.updateDynamic("createStartMenuShortcut")(createStartMenuShortcut)
    if (menuCategory != null) __obj.updateDynamic("menuCategory")(menuCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(oneClick)) __obj.updateDynamic("oneClick")(oneClick)
    if (!js.isUndefined(perMachine)) __obj.updateDynamic("perMachine")(perMachine)
    if (!js.isUndefined(runAfterFinish)) __obj.updateDynamic("runAfterFinish")(runAfterFinish)
    if (shortcutName != null) __obj.updateDynamic("shortcutName")(shortcutName)
    __obj.asInstanceOf[CommonWindowsInstallerConfiguration]
  }
}

