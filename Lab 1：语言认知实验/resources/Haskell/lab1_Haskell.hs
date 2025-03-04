import Data.List (transpose)
import System.IO
import System.CPUTime

inpath = "testdata02.txt"
outpath = "result_Haskell01.txt"

(*.) :: [[Int]] -> [[Int]] -> [[Int]]
a *. b = [ [ sum $ zipWith (*) x y | y<- transpose b] | x<-a ]

readMatrix :: [String] -> ([[Int]], [[Int]])
readMatrix xs = (f a, f b)
    where
    a = takeWhile (not . null) xs
    b = tail $ dropWhile (not . null) xs
    f = map (map read . words)

main = do
    start  <- getCPUTime
    file <- readFile inpath
    let (a, b) = readMatrix $ lines file
        c  = a *. b
        c1 = map (unwords . map show) c
        c2 = unlines c1
    writeFile outpath c2
    end    <- getCPUTime
    let cost_time =  (fromIntegral(end- start))/ (10 ^ 12)
    let r = "TIME: " ++ (show cost_time) ++ "s.\n"
    putStr r
    writeFile outpath r