package frc.team4069.keigen

import org.ejml.dense.row.CommonOps_DDRM
import org.ejml.dense.row.NormOps_DDRM
import org.ejml.simple.SimpleMatrix

open class Matrix<R: Num, C: Num> internal constructor(internal val storage: SimpleMatrix) {
    val numCols get(): Int = storage.numCols()
    val numRows get(): Int = storage.numRows()

    operator fun get(i: Int, j: Int): Double = storage[i, j]

    operator fun set(i: Int, j: Int, k: Double) {
        storage[i, j] = k
    }

    fun diag(): Matrix<R, C> = Matrix(storage.diag())
    fun maxInternal(): Double = CommonOps_DDRM.elementMax(this.storage.ddrm)
    fun minInternal(): Double = CommonOps_DDRM.elementMin(this.storage.ddrm)
    fun mean() = elementSum() / storage.numElements.toDouble()

    operator fun <C2: Num> times(other: Matrix<C, C2>): Matrix<R, C2>
        = Matrix(this.storage.mult(other.storage))

    operator fun times(value: Double): Matrix<R, C>
        = Matrix(this.storage.scale(value))

    fun elementTimes(other: Matrix<R, C>): Matrix<R, C>
        = Matrix(this.storage.elementMult(other.storage))

    operator fun unaryMinus(): Matrix<R, C> = Matrix(storage.scale(-1.0))

    operator fun minus(value: Double): Matrix<R, C> = Matrix(storage.minus(value))

    operator fun minus(value: Matrix<R, C>): Matrix<R, C> = Matrix(storage.minus(value.storage))

    operator fun plus(value: Double): Matrix<R, C> = Matrix(storage.plus(value))

    operator fun plus(value: Matrix<R, C>): Matrix<R, C> = Matrix(storage.plus(value.storage))

    operator fun div(value: Int): Matrix<R, C> = Matrix(storage.divide(value.toDouble()))

    operator fun div(value: Double): Matrix<R, C> = Matrix(storage.divide(value))

    fun transpose(): Matrix<C, R> = Matrix(storage.transpose())

    fun copy(): Matrix<R, C> = Matrix(storage.copy())

    fun inv(): Matrix<R, C> = Matrix(storage.invert())

    fun det(): Double = storage.determinant()

    fun normF(): Double = storage.normF()

    fun normIndP1(): Double = NormOps_DDRM.inducedP1(this.storage.ddrm)

    fun elementSum(): Double = this.storage.elementSum()

    fun trace(): Double = this.storage.trace()

    fun epow(other: Double): Matrix<R, C> = Matrix(storage.elementPower(other))
    fun epow(other: Int): Matrix<R, C> = Matrix(storage.elementPower(other.toDouble()))
}
