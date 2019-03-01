package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlWriter
  extends extjsLib.ExtNs.dataNs.writerNs.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
}

object IXmlWriter {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    dateFormat: java.lang.String = null,
    defaultDocumentRoot: java.lang.String = null,
    documentRoot: java.lang.String = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getRecordData: js.Function2[/* record */ js.UndefOr[IModel], /* operation */ js.UndefOr[IOperation], _] = null,
    header: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IXmlWriter] = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    record: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null,
    write: js.Function1[/* request */ js.UndefOr[IRequest], IRequest] = null,
    writeAllFields: js.UndefOr[scala.Boolean] = js.undefined,
    writeRecordId: js.UndefOr[scala.Boolean] = js.undefined
  ): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (defaultDocumentRoot != null) __obj.updateDynamic("defaultDocumentRoot")(defaultDocumentRoot)
    if (documentRoot != null) __obj.updateDynamic("documentRoot")(documentRoot)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(getRecordData)
    if (header != null) __obj.updateDynamic("header")(header)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (record != null) __obj.updateDynamic("record")(record)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(write)
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    if (!js.isUndefined(writeRecordId)) __obj.updateDynamic("writeRecordId")(writeRecordId)
    __obj.asInstanceOf[IXmlWriter]
  }
}

