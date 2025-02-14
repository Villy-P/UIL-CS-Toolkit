<script>
	import Button from "../components/Button.svelte";
	import UnderlineButton from "../components/UnderlineButton.svelte";
</script>

<div class="w-full h-screen flex items-center">
    <div class="px-20 flex flex-col gap-4">
        <h1 class="text-5xl font-extrabold">UIL Computer Science Toolkit</h1>
        <p>An all-in-one toolkit for everything you need for the University Interscholastic League Computer Science Competition, from cheatsheets and guides about important topics, to questions directly from UIL tests to help you improve.</p>
        <div class="flex gap-3">
            <UnderlineButton text="Reference Sheet" href="/topics"/>
            <Button text="Get Started" href="/topics"/>
        </div>
    </div>
</div>