package typings
package chaiDashAsDashPromisedLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Eventually does not have .then(), but PromisedAssertion have.
@js.native
trait Eventually
  extends PromisedLanguageChains
     with PromisedNumericComparison
     with PromisedTypeComparison {
  @JSName("Arguments")
  var Arguments_Original: PromisedAssertion = js.native
  @JSName("NaN")
  var NaN_Original: PromisedAssertion = js.native
  @JSName("Throw")
  var Throw_Original: PromisedThrow = js.native
  @JSName("a")
  var a_Original: PromisedTypeComparison = js.native
  var all: PromisedKeyFilter = js.native
  @JSName("an")
  var an_Original: PromisedTypeComparison = js.native
  var any: PromisedKeyFilter = js.native
  @JSName("approximately")
  var approximately_Original: PromisedCloseTo = js.native
  @JSName("arguments")
  var arguments_Original: PromisedAssertion = js.native
  @JSName("change")
  var change_Original: PromisedPropertyChange = js.native
  @JSName("changes")
  var changes_Original: PromisedPropertyChange = js.native
  @JSName("closeTo")
  var closeTo_Original: PromisedCloseTo = js.native
  @JSName("contain")
  var contain_Original: PromisedInclude = js.native
  @JSName("decrease")
  var decrease_Original: PromisedPropertyChange = js.native
  @JSName("decreases")
  var decreases_Original: PromisedPropertyChange = js.native
  var deep: PromisedDeep = js.native
  @JSName("empty")
  var empty_Original: PromisedAssertion = js.native
  @JSName("eq")
  var eq_Original: PromisedEqual = js.native
  @JSName("eql")
  var eql_Original: PromisedEqual = js.native
  @JSName("eqls")
  var eqls_Original: PromisedEqual = js.native
  @JSName("equal")
  var equal_Original: PromisedEqual = js.native
  @JSName("equals")
  var equals_Original: PromisedEqual = js.native
  @JSName("exist")
  var exist_Original: PromisedAssertion = js.native
  @JSName("extensible")
  var extensible_Original: PromisedAssertion = js.native
  @JSName("false")
  var false_Original: PromisedAssertion = js.native
  @JSName("frozen")
  var frozen_Original: PromisedAssertion = js.native
  @JSName("fulfilled")
  var fulfilled_Original: PromisedAssertion = js.native
  @JSName("haveOwnPropertyDescriptor")
  var haveOwnPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
  @JSName("haveOwnProperty")
  var haveOwnProperty_Original: PromisedOwnProperty = js.native
  @JSName("include")
  var include_Original: PromisedInclude = js.native
  @JSName("increase")
  var increase_Original: PromisedPropertyChange = js.native
  @JSName("increases")
  var increases_Original: PromisedPropertyChange = js.native
  @JSName("itself")
  var itself_Original: PromisedAssertion = js.native
  @JSName("keys")
  var keys_Original: PromisedKeys = js.native
  @JSName("lengthOf")
  var lengthOf_Original: PromisedLength = js.native
  @JSName("length")
  var length_Original: PromisedLength = js.native
  @JSName("match")
  var match_Original: PromisedMatch = js.native
  @JSName("matches")
  var matches_Original: PromisedMatch = js.native
  @JSName("members")
  var members_Original: PromisedMembers = js.native
  var nested: PromisedNested = js.native
  // From chai
  @JSName("not")
  var not_Original: PromisedAssertion = js.native
  @JSName("null")
  var null_Original: PromisedAssertion = js.native
  @JSName("ok")
  var ok_Original: PromisedAssertion = js.native
  var ordered: PromisedOrdered = js.native
  @JSName("ownPropertyDescriptor")
  var ownPropertyDescriptor_Original: PromisedOwnPropertyDescriptor = js.native
  @JSName("ownProperty")
  var ownProperty_Original: PromisedOwnProperty = js.native
  @JSName("property")
  var property_Original: PromisedProperty = js.native
  @JSName("rejectedWith")
  var rejectedWith_Original: PromisedThrow = js.native
  @JSName("rejected")
  var rejected_Original: PromisedAssertion = js.native
  @JSName("respondTo")
  var respondTo_Original: PromisedRespondTo = js.native
  @JSName("respondsTo")
  var respondsTo_Original: PromisedRespondTo = js.native
  @JSName("satisfies")
  var satisfies_Original: PromisedSatisfy = js.native
  @JSName("satisfy")
  var satisfy_Original: PromisedSatisfy = js.native
  @JSName("sealed")
  var sealed_Original: PromisedAssertion = js.native
  @JSName("throw")
  var throw_Original: PromisedThrow = js.native
  @JSName("throws")
  var throws_Original: PromisedThrow = js.native
  @JSName("true")
  var true_Original: PromisedAssertion = js.native
  @JSName("undefined")
  var undefined_Original: PromisedAssertion = js.native
  def Arguments(`type`: java.lang.String): PromisedAssertion = js.native
  def Arguments(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def NaN(`type`: java.lang.String): PromisedAssertion = js.native
  def NaN(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def Throw(): PromisedAssertion = js.native
  def Throw(constructor: js.Function): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp): PromisedAssertion = js.native
  def Throw(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def Throw(constructor: stdLib.Error): PromisedAssertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String): PromisedAssertion = js.native
  def Throw(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp): PromisedAssertion = js.native
  def Throw(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def Throw(expected: java.lang.String): PromisedAssertion = js.native
  def Throw(expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def Throw(expected: stdLib.RegExp): PromisedAssertion = js.native
  def Throw(expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def a(`type`: java.lang.String): PromisedAssertion = js.native
  def a(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def an(`type`: java.lang.String): PromisedAssertion = js.native
  def an(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def approximately(expected: scala.Double, delta: scala.Double): PromisedAssertion = js.native
  def approximately(expected: scala.Double, delta: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def arguments(`type`: java.lang.String): PromisedAssertion = js.native
  def arguments(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  // From chai-as-promised
  def become(expected: js.Any): PromisedAssertion = js.native
  def change(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def change(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def changes(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def changes(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double): PromisedAssertion = js.native
  def closeTo(expected: scala.Double, delta: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def contain(value: java.lang.String): PromisedAssertion = js.native
  def contain(value: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def contain(value: js.Object): PromisedAssertion = js.native
  def contain(value: js.Object, message: java.lang.String): PromisedAssertion = js.native
  def contain(value: scala.Double): PromisedAssertion = js.native
  def contain(value: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def decrease(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def decrease(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def decreases(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def decreases(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def empty(`type`: java.lang.String): PromisedAssertion = js.native
  def empty(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def eq(value: js.Any): PromisedAssertion = js.native
  def eq(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def eql(value: js.Any): PromisedAssertion = js.native
  def eql(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def eqls(value: js.Any): PromisedAssertion = js.native
  def eqls(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def equal(value: js.Any): PromisedAssertion = js.native
  def equal(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def equals(value: js.Any): PromisedAssertion = js.native
  def equals(value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def exist(`type`: java.lang.String): PromisedAssertion = js.native
  def exist(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def extensible(`type`: java.lang.String): PromisedAssertion = js.native
  def extensible(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `false`(`type`: java.lang.String): PromisedAssertion = js.native
  def `false`(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def frozen(`type`: java.lang.String): PromisedAssertion = js.native
  def frozen(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def fulfilled(`type`: java.lang.String): PromisedAssertion = js.native
  def fulfilled(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def haveOwnProperty(name: java.lang.String): PromisedAssertion = js.native
  def haveOwnProperty(name: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor, message: java.lang.String): PromisedAssertion = js.native
  def haveOwnPropertyDescriptor(name: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String): PromisedAssertion = js.native
  def include(value: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def include(value: js.Object): PromisedAssertion = js.native
  def include(value: js.Object, message: java.lang.String): PromisedAssertion = js.native
  def include(value: scala.Double): PromisedAssertion = js.native
  def include(value: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def increase(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def increase(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def increases(`object`: js.Object, property: java.lang.String): PromisedAssertion = js.native
  def increases(`object`: js.Object, property: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def itself(`type`: java.lang.String): PromisedAssertion = js.native
  def itself(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def key(string: java.lang.String): PromisedAssertion = js.native
  def keys(keys: java.lang.String*): PromisedAssertion = js.native
  def keys(keys: js.Array[_]): PromisedAssertion = js.native
  def keys(keys: js.Object): PromisedAssertion = js.native
  def length(length: scala.Double): PromisedAssertion = js.native
  def length(length: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def lengthOf(length: scala.Double): PromisedAssertion = js.native
  def lengthOf(length: scala.Double, message: java.lang.String): PromisedAssertion = js.native
  def `match`(regexp: java.lang.String): PromisedAssertion = js.native
  def `match`(regexp: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `match`(regexp: stdLib.RegExp): PromisedAssertion = js.native
  def `match`(regexp: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def matches(regexp: java.lang.String): PromisedAssertion = js.native
  def matches(regexp: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def matches(regexp: stdLib.RegExp): PromisedAssertion = js.native
  def matches(regexp: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def members(set: js.Array[_]): PromisedAssertion = js.native
  def members(set: js.Array[_], message: java.lang.String): PromisedAssertion = js.native
  // From chai
  def not(`type`: java.lang.String): PromisedAssertion = js.native
  def not(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def notify(fn: js.Function): PromisedAssertion = js.native
  def `null`(`type`: java.lang.String): PromisedAssertion = js.native
  def `null`(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def ok(`type`: java.lang.String): PromisedAssertion = js.native
  def ok(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def oneOf(list: js.Array[_]): PromisedAssertion = js.native
  def oneOf(list: js.Array[_], message: java.lang.String): PromisedAssertion = js.native
  def ownProperty(name: java.lang.String): PromisedAssertion = js.native
  def ownProperty(name: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: java.lang.String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, descriptor: stdLib.PropertyDescriptor, message: java.lang.String): PromisedAssertion = js.native
  def ownPropertyDescriptor(name: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any): PromisedAssertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): PromisedAssertion = js.native
  def rejected(`type`: java.lang.String): PromisedAssertion = js.native
  def rejected(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def rejectedWith(expected: stdLib.RegExp): PromisedAssertion = js.native
  def rejectedWith(expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def respondTo(method: java.lang.String): PromisedAssertion = js.native
  def respondTo(method: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def respondsTo(method: java.lang.String): PromisedAssertion = js.native
  def respondsTo(method: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def satisfies(matcher: js.Function): PromisedAssertion = js.native
  def satisfies(matcher: js.Function, message: java.lang.String): PromisedAssertion = js.native
  def satisfy(matcher: js.Function): PromisedAssertion = js.native
  def satisfy(matcher: js.Function, message: java.lang.String): PromisedAssertion = js.native
  def `sealed`(`type`: java.lang.String): PromisedAssertion = js.native
  def `sealed`(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def string(string: java.lang.String): PromisedAssertion = js.native
  def string(string: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(): PromisedAssertion = js.native
  def `throw`(constructor: js.Function): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp): PromisedAssertion = js.native
  def `throw`(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(constructor: stdLib.Error): PromisedAssertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String): PromisedAssertion = js.native
  def `throw`(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp): PromisedAssertion = js.native
  def `throw`(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(expected: java.lang.String): PromisedAssertion = js.native
  def `throw`(expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def `throw`(expected: stdLib.RegExp): PromisedAssertion = js.native
  def `throw`(expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def throws(): PromisedAssertion = js.native
  def throws(constructor: js.Function): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp): PromisedAssertion = js.native
  def throws(constructor: js.Function, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def throws(constructor: stdLib.Error): PromisedAssertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String): PromisedAssertion = js.native
  def throws(constructor: stdLib.Error, expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp): PromisedAssertion = js.native
  def throws(constructor: stdLib.Error, expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def throws(expected: java.lang.String): PromisedAssertion = js.native
  def throws(expected: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def throws(expected: stdLib.RegExp): PromisedAssertion = js.native
  def throws(expected: stdLib.RegExp, message: java.lang.String): PromisedAssertion = js.native
  def `true`(`type`: java.lang.String): PromisedAssertion = js.native
  def `true`(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
  def undefined(`type`: java.lang.String): PromisedAssertion = js.native
  def undefined(`type`: java.lang.String, message: java.lang.String): PromisedAssertion = js.native
}

