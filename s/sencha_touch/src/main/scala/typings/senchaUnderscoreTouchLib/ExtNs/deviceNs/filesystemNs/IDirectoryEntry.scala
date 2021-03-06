package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.filesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectoryEntry extends IEntry {
  /** [Method] Works the same way as getFile but creates or looks up a directory
  		* @param config Object
  		*/
  var getDirectory: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Requests a Directory from the Local File System
  		* @param config Object
  		*/
  var getEntry: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Creates or looks up a file
  		* @param config Object The object which contains the following config options:
  		*/
  var getFile: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Lists all the entries in the directory
  		* @param config Object The object which contains the following config options:
  		*/
  var readEntries: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Works the same way as Ext device filesystem Entry remove but removes the directory and all of its contents if any
  		* @param config Object
  		*/
  var removeRecursively: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IDirectoryEntry {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    copyTo: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getDirectory: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getEntry: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getFile: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    getFileSystem: () => IFileSystem = null,
    getFullPath: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getName: () => java.lang.String = null,
    getParent: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    isDirectory: () => scala.Boolean = null,
    isFile: () => scala.Boolean = null,
    mixins: js.Any = null,
    moveTo: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    platformConfig: js.Any = null,
    readEntries: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    remove: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    removeRecursively: /* config */ js.UndefOr[js.Any] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IDirectoryEntry = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (copyTo != null) __obj.updateDynamic("copyTo")(js.Any.fromFunction1(copyTo))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDirectory != null) __obj.updateDynamic("getDirectory")(js.Any.fromFunction1(getDirectory))
    if (getEntry != null) __obj.updateDynamic("getEntry")(js.Any.fromFunction1(getEntry))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction1(getFile))
    if (getFileSystem != null) __obj.updateDynamic("getFileSystem")(js.Any.fromFunction0(getFileSystem))
    if (getFullPath != null) __obj.updateDynamic("getFullPath")(js.Any.fromFunction0(getFullPath))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction1(getParent))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (isDirectory != null) __obj.updateDynamic("isDirectory")(js.Any.fromFunction0(isDirectory))
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction0(isFile))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction1(moveTo))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (readEntries != null) __obj.updateDynamic("readEntries")(js.Any.fromFunction1(readEntries))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeRecursively != null) __obj.updateDynamic("removeRecursively")(js.Any.fromFunction1(removeRecursively))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDirectoryEntry]
  }
}

