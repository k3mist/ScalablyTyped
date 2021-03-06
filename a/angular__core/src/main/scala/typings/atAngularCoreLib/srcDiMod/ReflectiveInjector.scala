package typings
package atAngularCoreLib.srcDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di", "ReflectiveInjector")
@js.native
abstract class ReflectiveInjector ()
  extends atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector

/* static members */
@JSImport("@angular/core/src/di", "ReflectiveInjector")
@js.native
object ReflectiveInjector extends js.Object {
  /**
    * Creates an injector from previously resolved providers.
    *
    * This API is the recommended way to construct injectors in performance-sensitive parts.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var providers = ReflectiveInjector.resolve([Car, Engine]);
    * var injector = ReflectiveInjector.fromResolvedProviders(providers);
    * expect(injector.get(Car) instanceof Car).toBe(true);
    * ```
    */
  def fromResolvedProviders(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider]
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  def fromResolvedProviders(
    providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  /**
    * Turns an array of provider definitions into an array of resolved providers.
    *
    * A resolution is a process of flattening multiple nested arrays and converting individual
    * providers into an array of `ResolvedReflectiveProvider`s.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var providers = ReflectiveInjector.resolve([Car, [[Engine]]]);
    *
    * expect(providers.length).toEqual(2);
    *
    * expect(providers[0] instanceof ResolvedReflectiveProvider).toBe(true);
    * expect(providers[0].key.displayName).toBe("Car");
    * expect(providers[0].dependencies.length).toEqual(1);
    * expect(providers[0].factory).toBeDefined();
    *
    * expect(providers[1].key.displayName).toBe("Engine");
    * });
    * ```
    *
    */
  def resolve(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider] = js.native
  /**
    * Resolves an array of providers and creates an injector from those providers.
    *
    * The passed-in providers can be an array of `Type`, `Provider`,
    * or a recursive array of more providers.
    *
    * @usageNotes
    * ### Example
    *
    * ```typescript
    * @Injectable()
    * class Engine {
    * }
    *
    * @Injectable()
    * class Car {
    *   constructor(public engine:Engine) {}
    * }
    *
    * var injector = ReflectiveInjector.resolveAndCreate([Car, Engine]);
    * expect(injector.get(Car) instanceof Car).toBe(true);
    * ```
    */
  def resolveAndCreate(providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider]): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
  def resolveAndCreate(
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.Provider],
    parent: atAngularCoreLib.srcDiInjectorMod.Injector
  ): atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod.ReflectiveInjector = js.native
}

