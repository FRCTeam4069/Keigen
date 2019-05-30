package frc.team4069.keigen

import org.ejml.dense.row.CommonOps_DDRM
import org.ejml.simple.SimpleMatrix

fun <R: Num, C: Num> zeros(rows: Nat<R>, cols: Nat<C>): Matrix<R, C> = Matrix(SimpleMatrix(rows.i, cols.i))
fun <D: Num> zeros(size: Nat<D>): Matrix<D, `1`> = Matrix(SimpleMatrix(size.i, 1))

fun <D: Num> eye(size: Nat<D>): Matrix<D, D> = Matrix(SimpleMatrix.identity(size.i))

fun <R: Num, C: Num> ones(rows: Nat<R>, cols: Nat<C>): Matrix<R, C> {
    val out = SimpleMatrix(rows.i, cols.i)
    CommonOps_DDRM.fill(out.ddrm, 1.0)
    return Matrix(out)
}
fun <D: Num> ones(size: Nat<D>): Matrix<D, `1`> {
    val out = SimpleMatrix(size.i, 1)
    CommonOps_DDRM.fill(out.ddrm, 1.0)
    return Matrix(out)
}

