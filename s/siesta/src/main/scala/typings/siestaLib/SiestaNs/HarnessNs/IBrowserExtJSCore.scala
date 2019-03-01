package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
trait IBrowserExtJSCore extends js.Object {
  var coverageUnit: java.lang.String
  var excludeCoverageUnits: stdLib.RegExp
  var installLoaderInstrumentationHook: scala.Boolean
}

object IBrowserExtJSCore {
  @scala.inline
  def apply(
    coverageUnit: java.lang.String,
    excludeCoverageUnits: stdLib.RegExp,
    installLoaderInstrumentationHook: scala.Boolean
  ): IBrowserExtJSCore = {
    val __obj = js.Dynamic.literal(coverageUnit = coverageUnit, excludeCoverageUnits = excludeCoverageUnits, installLoaderInstrumentationHook = installLoaderInstrumentationHook)
  
    __obj.asInstanceOf[IBrowserExtJSCore]
  }
}

