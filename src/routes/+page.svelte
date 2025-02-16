<script>
	import Button from "../components/Button.svelte";
	import Footer from "../components/Footer.svelte";
	import UnderlineButton from "../components/UnderlineButton.svelte";
</script>

<div class="w-full h-screen flex items-center border-b-2 border-gray-400">
    <div class="px-10 flex flex-col gap-4">
        <h1 class="text-6xl font-extrabold">UIL Computer Science Toolkit</h1>
        <p class="text-md">An all-in-one toolkit for everything you need for the University Interscholastic League Computer Science Competition, from cheatsheets and guides about important topics, to questions directly from UIL tests to help you improve.</p>
        <div class="flex gap-3">
            <UnderlineButton text="Reference Sheet" href="/topics"/>
            <Button text="View Topics" href="/topics" arrow/>
        </div>
    </div>
</div>
<div class="w-full flex items-center justify-center flex-wrap gap-5 my-20">
    <div class="w-80 h-[380px] shadow shadow-black p-5 m-5 rounded-lg bg-[#161616] hover:bg-[#1c1c1c]">
        <h2 class="text-2xl font-bold text-center pb-6">Resources</h2>
        <p>View Resources relating to Java topics. This can range from other websites to practice Java programming, to Java fundamentals, to focusing on certain subtopics like strings or bases. Practice programming with LeetCode or study Java fundamentals with W3Schools</p>
        <Button text="View Resources" href="/resources" arrow className="m-auto mt-3"/>
    </div>
    <div class="w-80 h-[380px] shadow shadow-black p-5 m-5 rounded-lg bg-[#161616] hover:bg-[#1c1c1c]">
        <h2 class="text-2xl font-bold text-center pb-6">Reference Sheet</h2>
        <p>Check out reference material that is given to you on the day of the UIL competition.</p>
        <Button text="Reference Sheet" href="/reference" arrow className="m-auto mt-3"/>
    </div>
    <div class="w-80 h-[380px] shadow shadow-black p-5 m-5 rounded-lg bg-[#161616] hover:bg-[#1c1c1c]">
        <h2 class="text-2xl font-bold text-center pb-6">Topics</h2>
        <p>View different topics to help you get better, from strings, arrays, bases, Big O, etc. Quickly go over important topics using cheatsheets and view long form resources for learning more about topics.</p>
        <Button text="View Topics" href="/topics" arrow className="m-auto mt-3"/>
    </div>
</div>
<Footer/>