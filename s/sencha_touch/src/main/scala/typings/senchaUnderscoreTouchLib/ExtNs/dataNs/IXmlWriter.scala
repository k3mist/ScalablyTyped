package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlWriter
  extends senchaUnderscoreTouchLib.ExtNs.dataNs.writerNs.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of defaultDocumentRoot
  		* @returns String
  		*/
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of documentRoot
  		* @returns String
  		*/
  var getDocumentRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of header
  		* @returns String
  		*/
  var getHeader: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns String
  		*/
  var getRecord: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var record: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Sets the value of defaultDocumentRoot
  		* @param defaultDocumentRoot String The new value.
  		*/
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of documentRoot
  		* @param documentRoot String The new value.
  		*/
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of header
  		* @param header String The new value.
  		*/
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record String The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method]
  		* @param request Object
  		* @param data Array
  		* @returns Object
  		*/
  var writeRecords: js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
}

object IXmlWriter {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaultDocumentRoot: java.lang.String = null,
    destroy: () => scala.Unit = null,
    documentRoot: java.lang.String = null,
    extend: java.lang.String = null,
    getDefaultDocumentRoot: () => java.lang.String = null,
    getDocumentRoot: () => java.lang.String = null,
    getHeader: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getNameProperty: () => java.lang.String = null,
    getRecord: () => java.lang.String = null,
    getRecordData: /* record */ js.UndefOr[js.Any] => _ = null,
    getWriteAllFields: () => scala.Boolean = null,
    header: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    nameProperty: java.lang.String = null,
    platformConfig: js.Any = null,
    record: java.lang.String = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDefaultDocumentRoot: /* defaultDocumentRoot */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDocumentRoot: /* documentRoot */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHeader: /* header */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setNameProperty: /* nameProperty */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setRecord: /* record */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setWriteAllFields: /* writeAllFields */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    write: /* request */ js.UndefOr[IRequest] => IRequest = null,
    writeAllFields: js.UndefOr[scala.Boolean] = js.undefined,
    writeRecords: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array]) => _ = null
  ): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultDocumentRoot != null) __obj.updateDynamic("defaultDocumentRoot")(defaultDocumentRoot)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (documentRoot != null) __obj.updateDynamic("documentRoot")(documentRoot)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getDefaultDocumentRoot != null) __obj.updateDynamic("getDefaultDocumentRoot")(js.Any.fromFunction0(getDefaultDocumentRoot))
    if (getDocumentRoot != null) __obj.updateDynamic("getDocumentRoot")(js.Any.fromFunction0(getDocumentRoot))
    if (getHeader != null) __obj.updateDynamic("getHeader")(js.Any.fromFunction0(getHeader))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNameProperty != null) __obj.updateDynamic("getNameProperty")(js.Any.fromFunction0(getNameProperty))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getRecordData != null) __obj.updateDynamic("getRecordData")(js.Any.fromFunction1(getRecordData))
    if (getWriteAllFields != null) __obj.updateDynamic("getWriteAllFields")(js.Any.fromFunction0(getWriteAllFields))
    if (header != null) __obj.updateDynamic("header")(header)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (nameProperty != null) __obj.updateDynamic("nameProperty")(nameProperty)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (record != null) __obj.updateDynamic("record")(record)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDefaultDocumentRoot != null) __obj.updateDynamic("setDefaultDocumentRoot")(js.Any.fromFunction1(setDefaultDocumentRoot))
    if (setDocumentRoot != null) __obj.updateDynamic("setDocumentRoot")(js.Any.fromFunction1(setDocumentRoot))
    if (setHeader != null) __obj.updateDynamic("setHeader")(js.Any.fromFunction1(setHeader))
    if (setNameProperty != null) __obj.updateDynamic("setNameProperty")(js.Any.fromFunction1(setNameProperty))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setWriteAllFields != null) __obj.updateDynamic("setWriteAllFields")(js.Any.fromFunction1(setWriteAllFields))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction1(write))
    if (!js.isUndefined(writeAllFields)) __obj.updateDynamic("writeAllFields")(writeAllFields)
    if (writeRecords != null) __obj.updateDynamic("writeRecords")(js.Any.fromFunction2(writeRecords))
    __obj.asInstanceOf[IXmlWriter]
  }
}

