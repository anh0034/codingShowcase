puts "Enter Input"
text = gets.chomp 
words = text.split

frequencies = Hash.new(0)
words.each do |x|
  frequencies["#{x}"] += 1
end
frequencies = frequencies.sort_by {|word, count|
  count
}
frequencies.reverse!
frequencies.each do |word, count|
  puts word + " " + count.to_s
end