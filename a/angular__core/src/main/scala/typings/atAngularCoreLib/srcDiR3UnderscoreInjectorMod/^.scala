package typings
package atAngularCoreLib.srcDiR3UnderscoreInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/r3_injector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createInjector(defType: js.Any): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(defType: js.Any, parent: atAngularCoreLib.srcDiInjectorMod.Injector): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: atAngularCoreLib.srcDiInjectorMod.Injector,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def isTypeProvider(value: SingleProvider): /* is @angular/core.@angular/core/src/di/provider.TypeProvider */ scala.Boolean = js.native
  def providerToFactory(provider: SingleProvider): js.Function0[_] = js.native
  def providerToFactory(provider: SingleProvider, ngModuleType: atAngularCoreLib.srcDiDefsMod.InjectorType[_]): js.Function0[_] = js.native
  def providerToFactory(
    provider: SingleProvider,
    ngModuleType: atAngularCoreLib.srcDiDefsMod.InjectorType[_],
    providers: js.Array[_]
  ): js.Function0[_] = js.native
}

