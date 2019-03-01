package typings
package fastDashSimplexDashNoiseLib.fastDashSimplexDashNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastSimplexNoise extends js.Object {
  val amplitude: scala.Double
  val frequency: scala.Double
  val octaves: scala.Double
  val perm: stdLib.Uint8Array
  val permMod12: stdLib.Uint8Array
  val persistence: scala.Double
  def cylindrical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double
  def cylindrical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double
  def cylindrical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def dot(gs: js.Array[scala.Double], coords: js.Array[scala.Double]): scala.Double
  def random(): scala.Double
  def raw(coords: js.Array[scala.Double]): scala.Double
  def raw2D(x: scala.Double, y: scala.Double): scala.Double
  def raw3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def raw4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double
  def scale(value: scala.Double): scala.Double
  def scaled(coords: js.Array[scala.Double]): scala.Double
  def scaled2D(x: scala.Double, y: scala.Double): scala.Double
  def scaled3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def scaled4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double
  def spherical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double
  def spherical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double
  def spherical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
}

object FastSimplexNoise {
  @scala.inline
  def apply(
    amplitude: scala.Double,
    cylindrical: js.Function2[scala.Double, js.Array[scala.Double], scala.Double],
    cylindrical2D: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    cylindrical3D: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    dot: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Double],
    frequency: scala.Double,
    octaves: scala.Double,
    perm: stdLib.Uint8Array,
    permMod12: stdLib.Uint8Array,
    persistence: scala.Double,
    random: js.Function0[scala.Double],
    raw: js.Function1[js.Array[scala.Double], scala.Double],
    raw2D: js.Function2[scala.Double, scala.Double, scala.Double],
    raw3D: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    raw4D: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    scale: js.Function1[scala.Double, scala.Double],
    scaled: js.Function1[js.Array[scala.Double], scala.Double],
    scaled2D: js.Function2[scala.Double, scala.Double, scala.Double],
    scaled3D: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    scaled4D: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    spherical: js.Function2[scala.Double, js.Array[scala.Double], scala.Double],
    spherical2D: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    spherical3D: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): FastSimplexNoise = {
    val __obj = js.Dynamic.literal(amplitude = amplitude, cylindrical = cylindrical, cylindrical2D = cylindrical2D, cylindrical3D = cylindrical3D, dot = dot, frequency = frequency, octaves = octaves, perm = perm, permMod12 = permMod12, persistence = persistence, random = random, raw = raw, raw2D = raw2D, raw3D = raw3D, raw4D = raw4D, scale = scale, scaled = scaled, scaled2D = scaled2D, scaled3D = scaled3D, scaled4D = scaled4D, spherical = spherical, spherical2D = spherical2D, spherical3D = spherical3D)
  
    __obj.asInstanceOf[FastSimplexNoise]
  }
}

