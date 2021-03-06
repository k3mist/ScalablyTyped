package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelBundler extends js.Object {
  def addAssetType(extension: java.lang.String, path: java.lang.String): scala.Unit
  def addPackager(`type`: java.lang.String, packager: java.lang.String): scala.Unit
  def bundle(): js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle]
  def middleware(): js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
    /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
    /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction, 
    _
  ]
}

object ParcelBundler {
  @scala.inline
  def apply(
    addAssetType: (java.lang.String, java.lang.String) => scala.Unit,
    addPackager: (java.lang.String, java.lang.String) => scala.Unit,
    bundle: () => js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle],
    middleware: () => js.Function3[
      /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
      /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
      /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction, 
      _
    ]
  ): ParcelBundler = {
    val __obj = js.Dynamic.literal(addAssetType = js.Any.fromFunction2(addAssetType), addPackager = js.Any.fromFunction2(addPackager), bundle = js.Any.fromFunction0(bundle), middleware = js.Any.fromFunction0(middleware))
  
    __obj.asInstanceOf[ParcelBundler]
  }
}

