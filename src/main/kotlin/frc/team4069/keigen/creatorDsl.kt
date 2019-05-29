package frc.team4069.keigen

import org.ejml.simple.SimpleMatrix

fun <R : Num, C : Num> mat(rows: Nat<R>, cols: Nat<C>) = MatBuilder(rows, cols)

fun <D : Num> vec(dim: Nat<D>) = VecBuilder(dim)

class MatBuilder<R : Num, C : Num>(val rows: Nat<R>, val cols: Nat<C>) {
    fun fill(vararg data: Double): Matrix<R, C> {
        if (data.size != rows.i * cols.i) {
            throw IllegalArgumentException("Invalid matrix data provided. Wanted ${rows.i} x ${cols.i} matrix, but got ${data.size} elements")
        }

        val matData = data.toList().chunked(cols.i).map { it.toDoubleArray() }.toTypedArray()
        return Matrix(rows, cols, SimpleMatrix(matData))
    }

    fun fill(vararg data: Int): Matrix<R, C> {
        if (data.size != rows.i * cols.i) {
            throw IllegalArgumentException("Invalid matrix data provided. Wanted ${rows.i} x ${cols.i} matrix, but got ${data.size} elements")
        }

        val matData = data.map { it.toDouble() }.chunked(cols.i).map { it.toDoubleArray() }.toTypedArray()
        return Matrix(rows, cols, SimpleMatrix(matData))
    }
}

class VecBuilder<D : Num>(val dim: Nat<D>) {
    fun fill(vararg data: Double): Vector<D> {
        if (data.size != dim.i) {
            throw IllegalArgumentException("Invalid number of elements for ${dim.i}-dimensional vector. got ${data.size} elements")
        }

        return Matrix(dim, `1`, SimpleMatrix(dim.i, 1, false, data))
    }

    fun fill(vararg data: Int): Vector<D> {
        if (data.size != dim.i) {
            throw IllegalArgumentException("Invalid number of elements for ${dim.i}-dimensional vector. got ${data.size} elements")
        }

        return Matrix(dim, `1`, SimpleMatrix(dim.i, 1, false, data.map { it.toDouble() }.toDoubleArray()))
    }
}
